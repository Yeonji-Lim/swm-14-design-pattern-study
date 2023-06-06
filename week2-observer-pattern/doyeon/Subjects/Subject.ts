import Observer from "../Objects/Observer";

export default interface Subject {
  registerObserver(o: Observer): void;
  removeObserver(o: Observer): void;
  notifyObservers(): void;
}
