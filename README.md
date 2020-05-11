# Autocomplete feature Using Trie

Autocomplete, or word completion, is a feature in which an application predicts the rest of a word a user is typing.

## Description
Trie data structure is a perfect fit to implement this feature efficient in terms of memory and time [O(length of string)].

Each path down the tree represents a word. At the bottom of the tree null nodes (indicated by * in the image) denote the end of a word. The actual implementation of these nodes is usually a special type of node, for example TerminatingNode which inherits from TrieNode.

