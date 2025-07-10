import {Injectable} from '@angular/core';
import {jwtDecode} from 'jwt-decode';

@Injectable({
  providedIn: 'root'
})
export class JwtService {

  decodeToken(): any {
    try {
      return jwtDecode(localStorage.getItem('token') || '');
    } catch (error) {
      console.error('Invalid token:', error);
      return null;
    }

  }

  getUserRole() : string {
    return this.decodeToken().aud
  }

  getUserUsername() : string {
    return this.decodeToken().sub
  }
}
