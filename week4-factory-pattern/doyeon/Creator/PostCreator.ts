import Post from "../Product/Post";

export default abstract class PostCreator {
  abstract createPost(item: string): Post;
  public uploadPost(item: string): Post {
    let post: Post = this.createPost(item);
    post.prepare();
    post.upload();
    post.use();

    return post;
  }
}
