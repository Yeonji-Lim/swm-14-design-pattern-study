import CrewChatRoom from "./CrewChatRoom";
import DirectChatRoom from "./DirectChatRoom";

export default class DirectChatRoomAdapter extends CrewChatRoom {
  private directChatRoom: DirectChatRoom;
  constructor(directChatRoom: DirectChatRoom) {
    super();
    this.directChatRoom = directChatRoom;
  }

  public create(): void {
    this.directChatRoom.create();
  }
  public join(user: string): void {
    console.log("<error> join : 새로운 인원을 추가할 수 없습니다. ");
  }

  public sendMessage(user: string, msg: string): void {
    this.directChatRoom.sendMessage(user, msg);
  }
}
