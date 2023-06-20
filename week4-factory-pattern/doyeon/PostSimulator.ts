import PostCreator from "./Creator/PostCreator";
import MyPostCreator from "./Creator/MyPostCreator";
import FriendCreator from "./Creator/FriendPostCreator";

var myCreator: PostCreator = new MyPostCreator();

var mypost = myCreator.uploadPost("사진");
console.log(mypost.getName() + " 가 불러왔습니다.\n");

var friendCreator: PostCreator = new FriendCreator();
var friendpost = friendCreator.uploadPost("동영상");

console.log(friendpost.getName() + " 가 불러왔습니다.\n");
