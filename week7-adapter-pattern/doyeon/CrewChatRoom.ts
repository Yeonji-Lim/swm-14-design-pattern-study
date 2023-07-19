export default abstract class CrewChatRoom {
  public abstract create(): void;
  public abstract join(user: string): void;
  public abstract sendMessage(user: string, msg: string): void;
}
