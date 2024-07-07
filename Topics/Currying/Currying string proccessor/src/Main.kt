fun stringProcessor(p: String): (String) -> (String) -> String {
    return { body ->
        { s -> p.uppercase() + body + s.lowercase() }
    }
}
