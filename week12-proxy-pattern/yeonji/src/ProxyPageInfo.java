public class ProxyPageInfo implements PageInfo {
	private String info = null;
	private final RealPageInfo realPageInfo;

	public ProxyPageInfo(RealPageInfo realPageInfo) {
		this.realPageInfo = realPageInfo;
	}
	@Override
	public String getInfo() {
		if(this.info == null) {
			this.info = this.realPageInfo.getInfo();
		} else {
			System.out.println("The info has already been retrieved.");
		}
		return this.info;
	}
}
