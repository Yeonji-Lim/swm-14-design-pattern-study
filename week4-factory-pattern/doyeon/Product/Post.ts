export default abstract class Post {
  public name!: string;
  public fileDataType!: string;

  public prepare(): void {
    console.log("준비 중 : " + this.getName());
    console.log("...글 내용 작성 중...");
    console.log("...파일 데이터 추가 중... -> + " + this.fileDataType);
    console.log("...파일데이터의 위치좌표 찾는 중...");
  }
  public upload(): void {
    console.log("업로드 완료!");
  }
  public use(): void {
    console.log("권한 : 읽기 가능");
  }
  public getName(): string {
    return this.name;
  }
}
