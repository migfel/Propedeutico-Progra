class TuringMachine:
    def __init__(self, tape, initial_state, final_states, transition_rules):
        self.tape = tape  # Cinta de la Máquina de Turing
        self.head_position = 0  # Posición inicial del cabezal
        self.current_state = initial_state  # Estado inicial
        self.final_states = final_states  # Estados finales
        self.transition_rules = transition_rules  # Reglas de transición
    
    def run(self):
        while self.current_state not in self.final_states:
            symbol = self.tape[self.head_position]  # Símbolo actual en la cinta
            action = self.transition_rules[self.current_state][symbol]  # Acción según la regla de transición
            
            # Realizar la acción correspondiente
            self.tape[self.head_position] = action['write_symbol']  # Escribir en la cinta
            self.head_position += action['move']  # Mover el cabezal
            self.current_state = action['next_state']  # Cambiar al siguiente estado
            
        if self.current_state in self.final_states:
            print("Máquina de Turing en estado de aceptación.")
        else:
            print("Máquina de Turing en estado de rechazo.")


# Ejemplo de uso
tape = ['0', '0', '1', '1', '0']
initial_state = 'q0'
final_states = ['qf']
transition_rules = {
    'q0': {
        '0': {'write_symbol': '1', 'move': 1, 'next_state': 'q0'},
        '1': {'write_symbol': '0', 'move': -1, 'next_state': 'qf'}
    },
    'qf': {}
}

tm = TuringMachine(tape, initial_state, final_states, transition_rules)
tm.run()

