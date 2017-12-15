#Este arquivo contem um erro sintático na linha 25, a definição da variavel deve terminar com '.', foi encontrado um ';'
PREFIX fn:     <http://aksw.org/sparqlify/>
PREFIX rdfs:   <http://www.w3.org/2000/01/rdf-schema#>
PREFIX rdf:    <http://www.w3.org/1999/02/22-rdf-syntax-ns#>
PREFIX xsd:    <http://www.w3.org/2001/XMLSchema#>
PREFIX dc:     <http://purl.org/dc/elements/1.1/>
PREFIX scv:    <http://purl.org/NET/scovo#>
PREFIX me:     <http://lod.unicentro.br/myExample/>

CREATE VIEW TemplateDefaultView As Construct {

  ?Evaluation rdf:type  rdf:Class                  ;
              rdf:type  scv:Item                   ;
              scv:dimension  ?City                 ;
              me:temCidade  ?City                  ;
              scv:dimension  ?IDHvalue             ;
              me:temIDH_medio  ?IDHvalue           ;
              scv:dimension  ?IDHeducation         ;
              me:temIDH_educacao  ?IDHeducation    ;
              scv:dimension  ?IDHlongevity         ;
              me:temIDH_longevidade  ?IDHlongevity ;
              scv:dimension  ?IDHprofit            ;
              me:temIDH_renda  ?IDHprofit          ;
              scv:dimension  ?Year                 ;
              me:temAno  ?Year                     ;
#
  ?City  rdf:type  rdf:Class      ;
         rdf:type  me:Cidade      ;
         rdf:type  scv:Dimension  ;
         dc:identifier  ?idIBGE   ;
         rdf:value  ?titleCity    .
#
  ?IDHvalue  rdf:type  rdf:Class     ;
             rdf:type  me:IDH_Medio  ;
             rdf:type  scv:dimension ;
             rdf:value  ?IDHV        .
#
  ?IDHeducation  rdf:type  rdf:Class       ;
                 rdf:type  me:IDH_educacao ;
                 rdf:type  scv:dimension   ;
                 rdf:value  ?IDHE          .
#
  ?IDHlongevity  rdf:type  rdf:Class          ;
                 rdf:type  me:IDH_longevidade ;
                 rdf:type  scv:dimension      ;
                 rdf:value  ?IDHL             .
#
  ?IDHprofit  rdf:type  rdf:Class     ;
              rdf:type  me:IDH_renda  ;
              rdf:type  scv:dimension ;
              rdf:value  ?IDHP        .
#
  ?Year  rdf:type  rdf:Class     ;
         rdf:type  me:Ano        ;
         rdf:type  scv:dimension ;
         rdf:value  ?Date        . 
}
WITH

#codigo IBGE = 4100103 -> 
#Ano = 1991
#?Evaluation -> http://lod.unicentro.br/myExample/Evaluation_4100103_1991	
?Evaluation = uri(concat('http://lod.unicentro.br/myExample/Evaluation_',fn:urlEncode(?1),'_',fn:urlEncode(?7)))

#codigo IBGE = 4100103 -> 
#?City -> http://lod.unicentro.br/myExample/City_4100103	
?City = uri(concat('http://lod.unicentro.br/myExample/City_',?1))

#IDH medio = 0.423 -> 
#?IDHvalue -> http://lod.unicentro.br/myExample/IDHvalue_0.423
?IDHvalue = uri(concat('http://lod.unicentro.br/myExample/IDHvalue_',?3))

#IDH educacao = 0.193 -> 
#?IDHeducation -> http://lod.unicentro.br/myExample/IDHedvalue_0.193
?IDHeducation = uri(concat('http://lod.unicentro.br/myExample/IDHeducation_',?4))

#IDH longevidade = 0.718 -> 
#?IDHlongevity -> http://lod.unicentro.br/myExample/IDHlongevity_0.718
?IDHlongevity = uri(concat('http://lod.unicentro.br/myExample/IDHlongevity_',?5))

#IDH renda = 0.545 -> 
#?IDHprofit -> http://lod.unicentro.br/myExample/IDHlongevity_0.545
?IDHprofit = uri(concat('http://lod.unicentro.br/myExample/IDHprofit_',?6))

#Ano da pesquisa = 1991 -> 
#?Year -> http://lod.unicentro.br/myExample/Year_1991
?Year = uri(concat('http://lod.unicentro.br/myExample/Year_',?7))

#codigo IBGE = 4100103 -> 
#?idIBGE = "4100103"	
?idIBGE = plainLiteral(?1)

#nome municipio = Abatiá -> 
#?titleCity = "Abatiá"	
?titleCity = plainLiteral(?2)

#IDH medio municipio = 0.423 ->
#?IDHV = "0.423"
?IDHV = plainLiteral(?3)

#IDH educacao municipio = 0.193 ->
#?IDHE = "0.193"
?IDHE = plainLiteral(?4)

#IDH longevidade municipio = 0.718 ->
#?IDHL = "0.718"
?IDHL = plainLiteral(?5)

#IDH renda municipio = 0.545 ->
#?IDHP = "0.545"
?IDHP = plainLiteral(?6)

#Ano da pesquisa = 1991 ->
#?Date = "1991"
?Date = plainLiteral(?7)
