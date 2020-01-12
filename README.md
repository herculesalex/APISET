# APISET
Api para consultar Datos de la SET - Paraguay

Para poder utilizar la api, se debe de acceder a la sgte URL:

GET: https://jcazal.com/datoscontribuyentes/{ruc_o_razon_social}

La misma puede ser consultada usando la razon social o el ruc.

EL Json que nos retorna es:
```json
[
  {
    "dv": 0,
    "id": 0,
    "razon_social": "string",
    "ruc": "string",
    "tipo": "string"
  }
]
```
Como se ve nos retorna un listado, ya que la api esta preparada para hacer busquedas por coincidencia; es decir, en caso de que no sepamos el ruc completo o el nombre completo de la razón social, nos devolvera un listado con las posibles coindicencias.

Ej:
https://jcazal.com/datoscontribuyentes/ñanduti

nos retorna
```json
[
   {
      "id":1105820,
      "ruc":"80069392",
      "dv":2,
      "razon_social":"ASOCIACION DE ARTESANOS DE ÑANDUTI OÑONDIVEPA DE PIRAYU",
      "tipo":"Persona Juridica"
   },
   {
      "id":1111602,
      "ruc":"80075754",
      "dv":8,
      "razon_social":"ASOCIACIÓN DE CONSERVACIÓN VIAL ÑANDUTI",
      "tipo":"Persona Juridica"
   },
   {
      "id":1105864,
      "ruc":"80069439",
      "dv":2,
      "razon_social":"ASOCIACION GRUPO ARTESANAL ÑANDUTI",
      "tipo":"Persona Juridica"
   },
   {
      "id":1098603,
      "ruc":"80061765",
      "dv":7,
      "razon_social":"ASOCIACION ITAUGUA TAVA ÑANDUTI",
      "tipo":"Persona Juridica"
   },
   {
      "id":1086531,
      "ruc":"80048861",
      "dv":0,
      "razon_social":"ASOCIACION TEJEDORAS DE ÑANDUTI DE ITAUGUA",
      "tipo":"Persona Juridica"
   },
   {
      "id":830419,
      "ruc":"80039648",
      "dv":0,
      "razon_social":"CASA ÑANDUTI S.R.L.",
      "tipo":"Persona Fisica"
   },
   {
      "id":1106867,
      "ruc":"80070499",
      "dv":1,
      "razon_social":"COMISION DIRECTIVA COORDINADORA DEL FESTIVAL DEL ÑANDUTI DE LA CIUDAD DE ITAUGUA",
      "tipo":"Persona Juridica"
   },
   {
      "id":1098162,
      "ruc":"80061303",
      "dv":1,
      "razon_social":"COMITE DE MUJERES ARTESANAS TEJEDORAS DE ÑANDUTI COMPAÑIA MBOCAYATY NORTE DISTRITO DE ITAUGUA DPTO. CENTRAL.",
      "tipo":"Persona Juridica"
   },
   {
      "id":1104085,
      "ruc":"80067579",
      "dv":7,
      "razon_social":"COMITE DE TEJEDORAS DE ÑANDUTI MEDALLA MILAGROSA",
      "tipo":"Persona Juridica"
   },
   {
      "id":1076607,
      "ruc":"80033994",
      "dv":0,
      "razon_social":"COMITE TEJIÑANDUTI",
      "tipo":"Persona Juridica"
   },
   {
      "id":1066129,
      "ruc":"80021405",
      "dv":6,
      "razon_social":"COOP.AHO.CRED.Y SERV. ÑANDUTI LTDA.",
      "tipo":"Persona Juridica"
   },
   {
      "id":1102507,
      "ruc":"80065903",
      "dv":1,
      "razon_social":"COORDINADORA DE ARTESANAS DE ÑANDUTI DE ITAUGUA",
      "tipo":"Persona Juridica"
   },
   {
      "id":1113060,
      "ruc":"80078076",
      "dv":0,
      "razon_social":"EMPRENDIMIENTOS ÑANDUTI S.A.C.I.",
      "tipo":"Persona Juridica"
   },
   {
      "id":1055592,
      "ruc":"80003082",
      "dv":6,
      "razon_social":"EMPRESA DE TRANSPORTE ÑANDUTI SRL",
      "tipo":"Persona Juridica"
   },
   {
      "id":1064887,
      "ruc":"80019655",
      "dv":4,
      "razon_social":"FABRICA DE LIENZO ÑANDUTI SRL",
      "tipo":"Persona Juridica"
   },
   {
      "id":1077040,
      "ruc":"80034514",
      "dv":2,
      "razon_social":"FARMACIA ÑANDUTI S R L",
      "tipo":"Persona Juridica"
   },
   {
      "id":351560,
      "ruc":"2960574",
      "dv":1,
      "razon_social":"FORNERON DA SILVA, ÑANDUTI LILIANA",
      "tipo":"Persona Fisica"
   },
   {
      "id":1056283,
      "ruc":"80004251",
      "dv":4,
      "razon_social":"GRAFICA ÑANDUTI SRL",
      "tipo":"Persona Juridica"
   },
   {
      "id":1061427,
      "ruc":"80014116",
      "dv":4,
      "razon_social":"IMPORTACIONES ÑANDUTI SRL",
      "tipo":"Persona Juridica"
   },
   {
      "id":617086,
      "ruc":"80009226",
      "dv":0,
      "razon_social":"IMPORTADORA ÑANDUTI SRL",
      "tipo":"Persona Fisica"
   },
   {
      "id":1058653,
      "ruc":"80008780",
      "dv":1,
      "razon_social":"ÑANDUTI ELECTRODOMESTICOS SRL",
      "tipo":"Persona Juridica"
   },
   {
      "id":1089286,
      "ruc":"80051827",
      "dv":6,
      "razon_social":"ÑANDUTI   REPRESENTACIONES  S.-A.",
      "tipo":"Persona Juridica"
   },
   {
      "id":1068640,
      "ruc":"80024656",
      "dv":0,
      "razon_social":"ÑANDUTI TODO HOGAR S.R.L.",
      "tipo":"Persona Juridica"
   },
   {
      "id":1055974,
      "ruc":"80003706",
      "dv":5,
      "razon_social":"ÑANDUTI TURISMO  SRL",
      "tipo":"Persona Juridica"
   },
   {
      "id":1084573,
      "ruc":"80046761",
      "dv":2,
      "razon_social":"ORGANIZACION ÑANDUTI",
      "tipo":"Persona Juridica"
   },
   {
      "id":1057880,
      "ruc":"80007450",
      "dv":5,
      "razon_social":"RADIO ÑANDUTI SA",
      "tipo":"Persona Juridica"
   }
]
```

### Copyright
# José Luis Cazal - 2020

