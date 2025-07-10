import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ApiService } from './api.service';
import { Adherent } from '../models/adherent.model';

@Injectable({
  providedIn: 'root'
})
export class AdherentService {
  private endpoint = 'adherent';

  constructor(private apiService: ApiService) { }

  getAllAdherents(): Observable<Adherent[]> {
    return this.apiService.get<Adherent[]>(this.endpoint);
  }

  getAdherentById(id: number): Observable<Adherent> {
    return this.apiService.getById<Adherent>(this.endpoint, id);
  }

  createAdherent(adherent: Adherent): Observable<Adherent> {
    return this.apiService.post<Adherent>(this.endpoint, adherent);
  }

  updateAdherent(id: number | undefined, adherent: Adherent): Observable<Adherent> {
    return this.apiService.put<Adherent>(`${this.endpoint}/update` , id, adherent);
  }


  deleteAdherent(id: number): Observable<any> {
    return this.apiService.delete<any>(this.endpoint, id);
  }

  getByUsername(username : string): Observable<Adherent>{
    return this.apiService.getByUsername(`${this.endpoint}/getByUsername?username=${username}`);
  }

}
