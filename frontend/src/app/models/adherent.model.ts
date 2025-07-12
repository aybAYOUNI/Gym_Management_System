
export enum  Sex{

  HOMME ='HOMME',
  FEMME = 'FEMME'
}


export interface Adherent {
    "id"?: number;
    "nom": string ;
    "firstName": string;
    "email": string;
    "gender": Sex ;
    "age": number ;
    "poids": number;
    "phone": string;
}
