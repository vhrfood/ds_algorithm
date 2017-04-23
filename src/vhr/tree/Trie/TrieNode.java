package vhr.tree.Trie;

import java.util.Map;

public class TrieNode {
    char data;
    Map<Character, TrieNode> trieNodes;

    public TrieNode(char data) {
        super();
        this.data = data;
        this.trieNodes = null;
    }
}
