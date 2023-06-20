import Post from "../Post";

export default class FriendVideoPost extends Post {
  constructor() {
    super();
    this.name = "친구가 올린 <영상> 포스트";
    this.fileDataType = "동영상";
  }
}
