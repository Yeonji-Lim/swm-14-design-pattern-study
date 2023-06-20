import PostCreator from "./PostCreator";
import Post from "../Product/Post";
import MyPhotoPost from "../Product/My/MyPhotoPost";
import MyVideoPost from "../Product/My/MyVideoPost";

export default class MyPostCreator extends PostCreator {
  createPost(item: string): Post {
    if (item === "사진") {
      return new MyPhotoPost();
    } else if (item === "동영상") {
      return new MyVideoPost();
    } else {
      throw new Error("지원하지 않는 아이템입니다.");
    }
  }
}
