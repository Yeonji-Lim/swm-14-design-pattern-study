import Post from "../Post";

export default class MyVideoPost extends Post {
  constructor() {
    super();
    this.name = "내가 올린 <영상> 포스트";
    this.fileDataType = "동영상";
  }
  use(): void {
    console.log("권한: 읽기, 수정, 삭제 가능");
  }
}
