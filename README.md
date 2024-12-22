# Word-Ladder
Given two words, beginWord and endWord, and a dictionary of words, return the length of the shortest transformation sequence from beginWord to endWord such that:
Explanation:
Data Structure:

A queue is used for BFS traversal.
A Set is used for fast lookups and to avoid revisiting words.
Logic:

Start with the beginWord and try transforming it one letter at a time.
If a transformation matches the endWord, return the current level + 1.
If the transformed word exists in the wordList, add it to the queue and remove it from the set.
Optimization:

Removing words from the set immediately after visiting avoids revisiting them and ensures efficiency.
