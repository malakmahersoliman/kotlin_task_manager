
data class Task(val title: String, val isDone: Boolean)


fun printTasks(tasks: List<Task>) {
    for (task in tasks) {
        val status = if (task.isDone) "✅" else "❌"
        println("$status ${task.title}")
    }
}

fun main() {
    val tasks = mutableListOf(
        Task("Submit assignment", true),
        Task("Clean the house", false),
        Task("Read Kotlin documentation", false)
    )

    printTasks(tasks)
}