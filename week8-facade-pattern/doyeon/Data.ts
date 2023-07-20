export default class Data{
    public getDataRadiusOne(center:number):string{
        console.log('1km 반경의 데이터를 주기적으로 가져옵니다.');
        return '데이터';
    }
    public getData(center: number, radius: number): string { 
        console.log('주어진 범위의 데이터를 주기적으로 가져옵니다.');
        return '데이터';
    }
    public getDataRadiusOneBackground(center: number): string{
        console.log('백그라운드 모드로 1km 반경의 데이터를 가져옵니다.');
        return '데이터';
        
    }

}