package blockchain;


public class Block {
	String id;
	int Nonce;
	String Data;
	double hash;
	double priviousHash;
	
	public void mine() {
		//mine block
		return Nonce
	}
	public static double calculateHash() {
		String str = id + Nonce.toString() + Data + hash.toString();
		hash = str.hashCode();
	}
	public static void setID(String ID) {
		id = ID;
	}
	public static void setPriviousHash(double hash) {
		priviousHash = hash;
	}
	
}
