package vhr.tree.Trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    public TrieNode root;

    public Trie() {
        super();
        this.root = new TrieNode('$');
    }

    public void addItemToTry(String item) {
        TrieNode newNode;
        TrieNode current = this.root;
        Map<Character, TrieNode> nodesMap = current.trieNodes;
        for (Character c : item.toCharArray()) {
            newNode = new TrieNode(c);
            if (nodesMap == null) {
                nodesMap = new HashMap<>();
                nodesMap.put(c, newNode);
                current.trieNodes = nodesMap;
                current = newNode;
            } else if (!nodesMap.containsKey(c)) {
                nodesMap.put(c, newNode);
                current = newNode;

            } else {
                current = nodesMap.get(c);
            }
            nodesMap = current.trieNodes;

        }
    }

  

}
