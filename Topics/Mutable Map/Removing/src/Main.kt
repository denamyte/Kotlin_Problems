fun removing(currentMap: MutableMap<Int, String>, value: String) =
    currentMap.filterValues { it != value }.toMutableMap()
