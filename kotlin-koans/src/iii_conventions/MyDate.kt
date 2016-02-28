package iii_conventions

import iii_conventions.TimeInterval.*
import java.time.LocalDate

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        val thisValue = ((year * 100) + month) * 100 + dayOfMonth
        val otherValue = ((other.year * 100) + other.month) * 100 + other.dayOfMonth

        return thisValue.compareTo(otherValue)
    }

    operator fun plus(timeInterval: TimeInterval): MyDate {
        val thisDate = LocalDate.of(this.year, this.month+1, this.dayOfMonth);

        val addedDate = when (timeInterval) {
            DAY -> thisDate.plusDays(1)
            WEEK -> thisDate.plusDays(7)
            YEAR -> thisDate.plusYears(1)
        }

        return MyDate(addedDate.getYear(),
                addedDate.getMonthValue()-1,
                addedDate.getDayOfMonth())
    }

    operator fun plus(timeInterval: RepeatedTimeInterval): MyDate {

        return 0.rangeTo(timeInterval.times - 1)
                .fold(this, { date, i -> date + timeInterval.timeInterval })
    }
}


operator fun MyDate.rangeTo(other: MyDate): DateRange = DateRange(this, other)

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR;

    infix operator fun times(times: Int): RepeatedTimeInterval {
        return RepeatedTimeInterval(this, times)
    }
}

class RepeatedTimeInterval(val timeInterval: TimeInterval, val times: Int) {

}

class DateRange(val start: MyDate, val endInclusive: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            var current = start
            override fun next(): MyDate {
                if (!hasNext()) {
                    throw IllegalStateException("no more!")
                }
                val tmp = current
                current = current.nextDay()
                return tmp;
            }

            override fun hasNext(): Boolean {
                return current <= endInclusive
            }
        }
    }

    operator fun contains(d: MyDate): Boolean {
        return start < d && d <= endInclusive
    }
}
