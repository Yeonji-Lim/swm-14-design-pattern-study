public class Main {
	public static void main(String[] args) {
		RealPageInfo realPageInfo = new RealPageInfo();
		ProxyPageInfo proxyPageInfo = new ProxyPageInfo(realPageInfo);
		System.out.println(proxyPageInfo.getInfo());
		System.out.println("--------------------");
		System.out.println(proxyPageInfo.getInfo());
	}
}
