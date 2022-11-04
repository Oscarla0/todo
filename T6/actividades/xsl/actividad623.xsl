<?xml version="1.0" encoding="utf-8"?>
<fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format" >
	<fo:layout-master-set>
		<fo:simple-page-master master-name="invitacion-boda" 
		page-height="9cm" page-width="20cm" margin-top="2.2cm" margin-bottom="0.5cm">
<fo:region-body/>
<fo:region-before extent="0.5cm"/>
<fo:region-after extent="0.5cm"/>
</fo:simple-page-master>
</fo:layout-master-set>
<fo:page-sequence master-reference="invitacion-boda">
<fo:static-content flow-name="xsl-region-before">
<fo:block text-align="right">Boda de Maria y Pedro</fo:block>
</fo:static-content>
<fo:flow flow-name="xsl-region-body">
<fo:block font-size="20pt" text-align="center" background-color="#4C66B9" color="white" padding-top="2pt" padding-bottom="3pt">
INVITACIÓN DE BODA
</fo:block>
<fo:block font-size="15pt" text-align="center" color="#483d8b" padding-top="6pt" padding-bottom="6pt">
Por parte del novio,Oscar y por parte de la novia ,Oscarla.
</fo:block>
<fo:block font-size="10pt" text-align="center" color="#483d8b" padding-bottom="12pt">
La boda se celebrará el dia 14 de febrero a las 13:14 horas españolas.
</fo:block>
<fo:block font-size="10pt" text-align="center" color="#483d8b" padding-bottom="12pt">
El lugar se celebra la boda es en Xianggelila en Madrid.
</fo:block>
<fo:block font-size="10pt" text-align="center" color="#483d8b" padding-bottom="12pt">
	Podrá confirmarlo con el numero :666555333.
</fo:block>
</fo:flow>
</fo:page-sequence>
</fo:root>