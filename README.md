# Autocomplete feature Using Trie

Autocomplete, or word completion, is a feature in which an application predicts the rest of a word a user is typing.

## Description
Trie data structure is a perfect fit to implement this feature efficient in terms of memory and time [O(length of string)].

Each path down the tree represents a word. At the bottom of the tree null nodes (indicated by * in the image) denote the end of a word. The actual implementation of these nodes is usually a special type of node, for example TerminatingNode which inherits from TrieNode.

Steps:                                  
1. Add code that implements such Trie data structure
2. Implement a function called addWord(String wordToAdd) that allows you to add words to your Trie.
3. Load and add all the words from the wordList.txt thats in the repo.
4. Implement a function wit the signature autoComplete(String wordBase). maxResults denotes how many results to return. If there are too many return the first ones in alphabetical order.                                     
For example if the input is "univer" it should return "universal, universalism, universalistic, universality, universally, universe, university". Optional: Limit the number of results returned to 10.
5. (optional) Implement a function called boolean removeWord(String wordToRemove): This function removes the given word from your Trie. It should return true if the removal was successful, false if the word was not in the trie.
