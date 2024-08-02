import { Component, OnInit } from '@angular/core';
import { Validators, FormGroup, FormControl, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { Datos } from '../models/datos.model';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-informacion',
  templateUrl: './informacion.component.html',
  styleUrl: './informacion.component.css'
})

export class InformacionComponent implements OnInit{


constructor(private router: Router) { }


ngOnInit(): void {}

    buscarCliente(): void {
      this.router.navigate(['resumen']);
    }

    numerodocumento = new FormControl('', [Validators.required, Validators.minLength(8), Validators.maxLength(11), Validators.pattern(/^[0-9]\d*$/)]);
    tipodocumento = new FormControl('', [Validators.required]);


}
