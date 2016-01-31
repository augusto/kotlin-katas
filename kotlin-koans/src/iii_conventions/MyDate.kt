package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        val thisValue = ((year * 100) + month) * 100 + dayOfMonth
        val otherValue = ((other.year * 100) + other.month) * 100 + other.dayOfMonth

        return thisValue.compareTo(otherValue)
    }
}


operator fun MyDate.rangeTo(other: MyDate): DateRange = DateRange(this, other)

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            var current = start
            override fun next(): MyDate {
                if(!hasNext()) {
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
