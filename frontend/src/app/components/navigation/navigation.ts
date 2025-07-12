import {Component, HostListener, OnInit} from '@angular/core';
import {Router, RouterLink, RouterLinkActive} from '@angular/router';
import {NgIf} from '@angular/common';
import {JwtService} from '../../services/jwt.service';

@Component({
  selector: 'app-navigation',
  standalone: true,
  imports: [RouterLink, RouterLinkActive, NgIf],
  templateUrl: './navigation.html',
  styleUrl: './navigation.scss'
})
export class NavigationComponent implements  OnInit {
  isMenuOpen: boolean = false;
  scrolled: boolean = false;
  hasRoleAdherent?: boolean;
  hasRoleCoach?: boolean;
  hasRoleAdmin?: boolean;
  private user: any;

  toggleMenu() {
    this.isMenuOpen = !this.isMenuOpen;
  }
  userRole: string | null = null;
  isLoggedIn: boolean = false;

  constructor(private jwtService: JwtService,private router: Router) {}


  ngOnInit() {
    const role = this.jwtService.getUserRole();
    this.isLoggedIn = this.jwtService.isLoggedIn();

    if (role) {
      this.userRole = role;
      console.log("Rôle utilisateur :", role);
      if (role == 'ADHERENT') {
        this.hasRoleAdherent = true;
      }
      if (role == 'COACH') {
        this.hasRoleCoach = true;
      }
      if (role == 'ADMIN') {
        this.hasRoleAdmin = true;
      }
    } else {
      console.warn("Aucun rôle trouvé ou utilisateur non connecté");
      this.userRole = 'VISITEUR';
    }
  }
  logout(): void {
    // ou   localStorage.clear();
    this.jwtService.logout();
    this.router.navigate(['/authentication']);
  }


  @HostListener('window:scroll', [])
  onWindowScroll() {
    // Change la valeur selon la hauteur de scroll souhaitée
    this.scrolled = window.scrollY > 50;
  }
}
