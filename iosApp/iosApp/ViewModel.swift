import Foundation
import Shared

@MainActor
class ViewModel : ObservableObject {
    var useCase: GetAllUsersUseCase
    
    @Published var users: [User] = []

    init(){
    self.useCase=GetAllUsersUseCase()
    }
    
    func observeDataFlow() {
        Task {
            do {
                users = try await useCase.invoke()
            }catch {
                debugPrint("Failed to get users with error \(error.localizedDescription)")
            }
        }
    }
}
