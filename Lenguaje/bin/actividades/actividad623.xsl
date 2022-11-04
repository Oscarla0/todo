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
<fo:block font-size="16pt" text-align="center" background-color="#9400d3" color="white" padding-top="2pt" padding-bottom="3pt">
TE INVITAMOS A NUESTRA BODA.
</fo:block>
<fo:block font-size="8pt" text-align="center" color="#483d8b" padding-top="4pt" padding-bottom="6pt">
De parte de los novios Maria y pedro.
</fo:block>
<fo:block font-size="8pt" text-align="center" color="#483d8b" padding-bottom="6pt">
La ceremonia tendra fecha el 30 de junio a las 12:00.
</fo:block>
<fo:block font-size="8pt" text-align="center" color="#483d8b" padding-bottom="6pt">
El lugar de la ceremonia es en la Iglesia de los santos situada en Sevilla.
</fo:block>
<fo:block font-size="8pt" text-align="center" color="#483d8b" padding-bottom="6pt">
	Puede confirmar su asistencia a este numero 689745324.
</fo:block>
</fo:flow>
</fo:page-sequence>
</fo:root>