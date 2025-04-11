package HashMap;

import java.util.LinkedList;
import java.util.Objects;

public class HashMapUsingArray {
	private LinkedList<Node>[] buckets;
	private int n; // no of nodes
	private int N; // no of Node buckets
	public HashMapUsingArray() {
		N=4;
		buckets = new LinkedList[N];
		for(int i=0;i<buckets.length;i++) {
			buckets[i] = new LinkedList<>();
		}
	}
	private class Node {
		int key;
		String value;
		Node(int key, String value) {
			this.key=key;
			this.value=value;
		}
	}
	public void put(int key, String value) {
		int bi=hashFunction(key);
		int di=getDataIndex(bi, key);
		if(di!=-1) { // key is present
			buckets[bi].get(di).value=value;
		} else {
			buckets[bi].add(new Node(key, value));
			n++;
		}
		double lambda=(double) n/N;
		if(lambda>2.0) {
			rehash();
		}
	}
	public void rehash() {
		LinkedList<Node>[] old=buckets;
		buckets=new LinkedList[N*2];
		N=buckets.length;
		for(int i=0;i<buckets.length;i++) {
			buckets[i]=new LinkedList<>();
		}
		n=0;
		for(int i=0;i<old.length;i++) {
			LinkedList<Node> list=old[i];
			for(int j=0;j<list.size();j++) {
				Node node=list.get(j);
				put(node.key, node.value);
			}
		}
	}
	public int getDataIndex(int bi, int key) {
		LinkedList<Node> list=buckets[bi];
		for(int i=0;i<list.size();i++) {
			Node node=list.get(i);
			if(node.key==key) {
				return i;
			}
		}
		return -1;
	}
	public int hashFunction(int key) {
		int hashcode=Objects.hash(key);
		hashcode=Math.abs(hashcode);
		return hashcode%buckets.length;
	}
	public String get(int key) {
//		for(int i=0;i<buckets.length;i++) {
//			LinkedList<Node> list=buckets[i];
//			for(int j=0;j<list.size();j++) {
//				Node node=list.get(j);
//				if(node.key==key) {
//					return node.value;
//				}
//			}
//		}
//		return null;
		int bi=hashFunction(key);
		int di=getDataIndex(bi, key);
		if(di==-1) {
			return null;
		} else {
			return buckets[bi].get(di).value;
		}
	}
	public void display() {
		for(int i=0;i<buckets.length;i++) {
			LinkedList<Node> list=buckets[i];
			for(int j=0;j<list.size();j++) {
				Node node=list.get(j);
				System.out.println(node.key+" -> "+node.value);
			}
		}
	}
}







