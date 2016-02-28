package iv_properties

import kotlin.properties.ReadWriteProperty
import util.TODO
import iii_conventions.MyDate
import java.util.*
import kotlin.reflect.KProperty

fun todoTask35(): Nothing = TODO(
    """
        Task 35.
        A delegate expression must have special 'get' and 'set' methods.
        You can see their signatures below (as members of the 'ReadWriteProperty' interface).

        Implement the members of the class 'EffectiveDate' so it can be delegated to.
        Store only the time in milliseconds in 'timeInMillis' property.
        Use the extension functions 'MyDate.toMillis' and 'Long.ToDate'.
    """,
    references = { date: MyDate -> date.toMillis().toDate()}
)

class D {
    var date by EffectiveDate()
    // The property date$delegate of type EffectiveDate is created;
    // the generated 'get' and 'set' accessors for 'date' are delegated to it.
    // Browse the Kotlin tool window in IntelliJ for details.
}

class EffectiveDate<R> : ReadWriteProperty<R, MyDate> {
    var timeInMillis: Long? = null

    operator override fun getValue(thisRef: R, property: KProperty<*>): MyDate = timeInMillis!!.toDate()
    operator override fun setValue(thisRef: R, property: KProperty<*>, value: MyDate) {
        timeInMillis = value.toMillis()
    }
}

private fun MyDate.toMillis(): Long {
    val c = Calendar.getInstance()
    c.set(year, month, dayOfMonth)
    return c.timeInMillis
}

private fun Long.toDate(): MyDate {
    val c = Calendar.getInstance()
    c.timeInMillis = this
    return MyDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE))
}
