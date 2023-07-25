import DirectChatRoom from "./DirectChatRoom";

export default class BDirect extends DirectChatRoom {
  constructor() {
    super();
  }
  public create(): void {
    console.log("\ncreate : B개인 채팅방 생성");
  }
  public sendMessage(user: string, msg: string): void {
    console.log(
      "sendMessage : B개인 채팅방에 " +
        user +
        '님이 "' +
        msg +
        '"라고 말했습니다.'
    );
  }
}
