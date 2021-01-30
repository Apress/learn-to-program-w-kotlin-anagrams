package lpk.anagrams

/**
 * An arrangement of characters which may
 * or may not be an English word.
 */
data class Term(val text: String) {

    fun permutations(): Set<Term> {
        val result = mutableSetOf<Term>()
        return result
    }
}