# Knuth-Morris-Pratt (KMP) string matching algorithm.


## Pattern Searching 

An important issue in computer science is pattern searching. Pattern searching methods are used to display the search results when we perform a string search in a database, browser, or notepad/word file. In the previous post, we spoke about the Naive Pattern Searching Algorithm. The Naive algorithm's worst-case complexity is O(m(n-m+1)). In the worst scenario, the KMP algorithm's temporal complexity is O(n). Pattern Searching using KMP (Knuth Morris Pratt) When there are numerous matching characters followed by a mismatching character, the Naive pattern searching algorithm struggles to find patterns.

### What KMP Algorithm do to out-perform naive approach?

The KMP matching algorithm uses degenerating property (pattern having same sub-patterns appearing more than once in the pattern) of the pattern and improves the worst case complexity to O(n). The basic idea behind KMP’s algorithm is: whenever we detect a mismatch (after some matches), we already know some of the characters in the text of the next window. We take advantage of this information to avoid matching the characters that we know will anyway match.

### Time Complexity : 

Time Complexity of KMP Algorithm is O(mn) where m and n are patterns and string lengths respectively.

### Space Complexity : 

Space Complexity of KMP Algorithm is O(1) as no space is made use of. 

### Intution :

Here, we utilize standard prefix principles. When we come across prefixes that are frequently used, we make a note of them so that they are not compared again in next searches.

### Approach :

Here, we create a pi Table to keep track of frequent prefixes. To make the procedure simpler, we must move the pattern's indexes up by 1. As a result, the pattern starts at index 1, and we always compare pattern[j+1] with string[i] rather than the pattern's jth index. The only difference is that we now go to the index that our pi table points to whenever there is a mismatch instead of stopping the search. So, until there is a mismatch or j=0, we keep returning to earlier indices of the pi table on mismatch ( refer to code for more understanding). As a result, when we discover that j is m, we stop since we have discovered the pattern; otherwise, when I reaches n, return -1.
