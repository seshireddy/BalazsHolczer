package com.cli.binarySearchTree;

public interface Tree<T> {
	public Node<T> getMax();
	public Node<T> getMin();
	public void insert(T data);
	public void remove(T value);
	public void traverseGraph(); //in-order-traversal
}
