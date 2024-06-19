fun resume(marks: Triple<String, Int, List<Double>>): Pair<String, Double> {
    return marks.first to marks.third.average()
}
