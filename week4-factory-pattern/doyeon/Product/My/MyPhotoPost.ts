import Post from "../Post";

export default class MyPhotoPost extends Post {
  constructor() {
    super();
    this.name = "내가 올린 <사진> 포스트";
    this.fileDataType = "사진";
  }
  use(): void {
    console.log("권한: 읽기, 수정, 삭제 가능");
  }
}
