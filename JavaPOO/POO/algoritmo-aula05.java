Classe ContaBanco
	//Atributos
	publico numConta: Inteiro
	protegido tipo: Caractere
	privado dono: Caractere
	privado saldo: Real
	privado status: Logico
	
	//Métodos Especiais
	publico Metodo Construtor()
		saldo = 0;
		status = falso;
	FimMetodo
	
	// Criar os getters e setters
	
	//Métodos
	publico Metodo abrirConta(t:Caractere)
		setTipo(t)
		setStatus(verdadeiro)
		
		se (t = "CC") entao
			saldo = 50
		senao se (t = "CP") entao
			saldo 150
		FimSe
	FimMetodo
	
	publico Metodo fecharConta()
		se (saldo > 0) entao
			Escreva("Conta com dinheiro")
		senao se (saldo < 0) entao
			Escreva("Conta em débito")
		senao
			setStatus(false)
		FimSe
	FimMetodo
	
	publico Metodo depositar(v:Real)
		se (status = verdadeiro) entao
			saldo = saldo + v
			// setSaldo(getSaldo() + v)
		senao
			Escreva("Impossível depositar")
		FimSe
	FimMetodo
	
	publico Metodo sacar(v:Real)
		se (status = verdadeiro) entao
			se (saldo > v) entao
				saldo = saldo - v
			senao
				Escreva("Saldo Insuficiente")
			FimSe
		senao
			Escreva("Impossível sacar")
		FimSe
	FimMetodo
	
	publico Metodo pagarMensal()
		var v: Real
		
		se (tipo = "CC") entao
			v = 12
		senao se (tipo = "CP") entao
			v = 20
		FimSe
		
		se (status = verdadeiro) entao
			se (saldo > v) entao
				saldo = saldo - v
			senao 
				Escreva("Saldo insuficiente")
			FimSe
		senao
			Escreva("Impossivel pagar")
		FimSe
	FimMetodo	
FimClasse
