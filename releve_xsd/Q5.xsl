<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="1.0">
    <xsl:template match="/">
        <html>
            <head>
                <title>Q4</title>
            </head>
            <body>
                <h2>Relevé Bancaire RIB : <xsl:value-of select="releve/@RIB"/></h2>
                <h2>Date de relevé : <xsl:value-of select="releve/dateReleve"/></h2>
                <h2>Solde de relevé : <xsl:value-of select="releve/solde"/></h2>
                <table border="1">
                    <tr>
                        <th>Type</th>
                        <th>Date</th>
                        <th>Montant</th>
                        <th>Description</th>
                    </tr>
                    <xsl:for-each select="releve/operations/operation[@type = 'CREDIT']">
                        <tr>
                            <td><xsl:value-of select="@type"/></td>
                            <td><xsl:value-of select="@date"/></td>
                            <td><xsl:value-of select="@montant"/></td>
                            <td><xsl:value-of select="@description"/></td>
                        </tr>
                    </xsl:for-each>
                    <tr>
                        <td colspan="2">Total débit</td>
                        <td colspan="2"><xsl:value-of select="sum(releve/operations/operation[@type = 'CREDIT']/@montant)"/></td>
                    </tr>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>