import Post from "../Post";

export default class FriendPhotoPost extends Post {
  constructor() {
    super();
    this.name = "내가 올린 <영상> 포스트";
    this.fileDataType = "영상";
  }
}
