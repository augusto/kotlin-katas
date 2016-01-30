package fizzbuzz

fun StringBuilder.reset(): StringBuilder {
    this.setLength(0)
    return this;
}