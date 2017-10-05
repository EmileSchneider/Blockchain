package blockchain;

import java.util.LinkedList;
import blockchain.Block;;
public class Chain {
	
	LinkedList<E> list = new LinkedList();
	
	public static void addBlock(Block block2add) {
		if(block2add) {
			list.add(block2add);
		}
	}
	public static Block readBlock(n) {
		return list.getElement(n-1);
	}
	private static boolean isBlockValid(block2check) {
		if(first_n_digits of block == 0) {
			return true;
		} else {
			return false;
		}
	}

}
