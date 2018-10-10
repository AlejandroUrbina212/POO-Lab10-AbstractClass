
class ForrestGump<T>(val life:RandomBox<T>) {
    var isRunning:Boolean = false
    fun runForrest() {
        isRunning = true
    }

    fun sayTheLine():String {
        val pickedCandy = life.pickOne() ?: return "Life sucks"

        return "Life is like a box of chocolates, you never know what is going out: \n$pickedCandy\n"
    }

}