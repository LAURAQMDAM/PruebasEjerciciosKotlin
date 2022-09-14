import java.util.regex.Matcher
import java.util.regex.Pattern

fun main(){

    println("Introduza un dni correcto")

    val dni= readln()
    Pattern patron= Pattern.compile("[a-z0-9]+@[a-z]")
    Matcher mat = p.matcher(dni);
}

/*" [a-z0-9]+@[a-z]+\\.[a-z]{2,3} "*/