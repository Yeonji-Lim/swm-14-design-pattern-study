import PostCreator from "./PostCreator";
import Post from "../Product/Post";
import FriendPhotoPost from "../Product/Friend/FriendPhotoPost";
import FriendVideoPost from "../Product/Friend/FriendVideoPost";

export default class FriendPostCreator extends PostCreator {
  createPost(item: string): Post {
    if (item === "사진") {
      return new FriendPhotoPost();
    } else if (item === "동영상") {
      return new FriendVideoPost();
    } else {
      throw new Error("지원하지 않는 아이템입니다.");
    }
  }
}
