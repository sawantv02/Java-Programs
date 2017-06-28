import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

public class WordDictionary {

	private class TrieNode {
		boolean endOfWord=false;
		HashMap<Character, TrieNode> map = new HashMap(26);;

	}

	/** Initialize your data structure here. */
	TrieNode root;

	public WordDictionary() {
		root = new TrieNode();
		root.endOfWord = false;

	}

	/** Adds a word into the data structure. */
	public void addWord(String word) {

		char ch[] = word.toCharArray();
		TrieNode current = root;
		int i = 0;
		while (i < ch.length) {
			if (!current.map.containsKey(ch[i])) {
				current.map.put(ch[i], new TrieNode());
			}

			current = current.map.get(ch[i]);
			i++;
		}
		current.endOfWord = true;
	}

	/**
	 * Returns if the word is in the data structure. A word could contain the
	 * dot character '.' to represent any one letter.
	 */
	public boolean search(String word) {
		return searchWord(word, root);
	}
	
	private boolean searchWord(String word,TrieNode root){
		char ch[] = word.toCharArray();
		TrieNode current = root;
		int i = 0;
		while (i < ch.length) {
			if (current.map.containsKey(ch[i])) {
				current = current.map.get(ch[i]);
			}
			i++;
		}

		if (current.endOfWord == true && i<ch.length)
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		WordDictionary wd = new WordDictionary();
		wd.addWord("abc");
		wd.addWord("abcde");
		boolean flag = wd.search("abcdef");
		System.out.println(flag);
	}
}
