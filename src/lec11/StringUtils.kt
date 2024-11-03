package lec11

// Java에서 StringUtils.isDirectoryPath()로 호출 가능
fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}
