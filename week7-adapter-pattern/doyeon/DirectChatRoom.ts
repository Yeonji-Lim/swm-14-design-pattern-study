export default abstract class DirectChatRoom {
  public abstract create(): void;
  public abstract sendMessage(user: string, msg: string): void;
}
