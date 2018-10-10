
fun main(args: Array<String>){

    println("FORREST GUMP")
    val chocolates = arrayListOf<Chocolate> (
            Chocolate("Chocolate 1", 100, "Licor"),
            Chocolate("Chocolate 2", 20, "Vómito"),
            Chocolate("Chocolate 3", 20, "Trúfula")
    )

    val forrestGump = ForrestGump<Chocolate>(RandomBox<Chocolate>(chocolates))

    println(forrestGump.sayTheLine())
    println(forrestGump.sayTheLine())
    println(forrestGump.sayTheLine())
    println(forrestGump.sayTheLine()) // in the fourth iteration, it will return life sucks,
    //because there aren't any candies left, damn, such a pesimist.

}