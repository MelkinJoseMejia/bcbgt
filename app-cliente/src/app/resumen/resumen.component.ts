import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

import data from '../../assets/data/cliente.json';

import { Cliente } from '../models/Cliente.model';
import { subscribe } from 'diagnostics_channel';

@Component({
  selector: 'app-resumen',
  templateUrl: './resumen.component.html',
  styleUrl: './resumen.component.css'
})
export class ResumenComponent {
  clienteRes: Cliente = {};


  constructor(private http: HttpClient, private router: Router){

  }

  ngOnInit(){
    console.log(data)
    this.clienteRes = data;

  }

  volver(): void {
    this.router.navigate(['home']);
  }

  

}
