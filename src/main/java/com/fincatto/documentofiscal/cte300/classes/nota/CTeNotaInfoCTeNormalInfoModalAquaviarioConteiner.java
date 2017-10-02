package com.fincatto.documentofiscal.cte300.classes.nota;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.ListValidador;
import com.fincatto.documentofiscal.validadores.StringValidador;

/**
 * @author Caio
 * @info Grupo de informações de detalhamento dos conteiners (Somente para Redespacho Intermediario e serviço vinculado)
 * */

@Root(name = "detCont")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoCTeNormalInfoModalAquaviarioConteiner extends DFBase {

	@Element(name = "nCont", required = true)
    private String identificacao;
	
	@ElementList(name = "lacre", inline = true, required = false)
    private List<CTeNotaInfoCTeNormalInfoModalAquaviarioConteinerLacre> lacre;
	
	@Element(name = "infDoc", required = false)
    private CTeNotaInfoCTeNormalInfoModalAquaviarioConteinerInfoDocumentos infoDocumentos;

	public CTeNotaInfoCTeNormalInfoModalAquaviarioConteiner() {
		this.identificacao = null;
		this.lacre = null;
		this.infoDocumentos = null;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	/**
	 * Identificação do Container
	 * */
	public void setIdentificacao(String identificacao) {
		StringValidador.tamanho20(identificacao, "Identificação do Containe");
		this.identificacao = identificacao;
	}

	public List<CTeNotaInfoCTeNormalInfoModalAquaviarioConteinerLacre> getLacre() {
		return lacre;
	}

	/**
	 * Grupo de informações dos lacres dos cointainers da qtde da carga
	 * */
	public void setLacre(List<CTeNotaInfoCTeNormalInfoModalAquaviarioConteinerLacre> lacre) {
		ListValidador.tamanho3(lacre, "Grupo de informações dos lacres dos cointainers da qtde da carga");
		this.lacre = lacre;
	}

	public CTeNotaInfoCTeNormalInfoModalAquaviarioConteinerInfoDocumentos getInfoDocumentos() {
		return infoDocumentos;
	}

	/**
	 * Informações dos documentos dos conteiners
	 * */
	public void setInfoDocumentos(CTeNotaInfoCTeNormalInfoModalAquaviarioConteinerInfoDocumentos infoDocumentos) {
		this.infoDocumentos = infoDocumentos;
	}
}